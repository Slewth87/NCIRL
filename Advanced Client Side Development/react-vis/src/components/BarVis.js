import { useState, useEffect } from "react";
import axios from "axios";
import Highcharts from 'highcharts/highcharts';
import BarChart from 'highcharts-react-official';

function BarVis() {
    const [sales,setSales] = useState([]);
    const [salesYear,setSalesYear] = useState([]);
    const config = {
        credits: {
            enabled: false
        },
        chart: {
            type: 'column'
        },
        title: {
            text: 'Earnings by year, per City'
        },
        xAxis: {
            categories: salesYear[0],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '€'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0">€<b>{point.y:.1f}</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: sales
    }

    useEffect(async function() {
        var dateSet = false
        var data = await axios.get("http://localhost:8080/sales")
        var formattedSales = data.data.map(function(earnings) {
            return {
                name: earnings.country,
                data: earnings.data
            }
        })
        var formattedSalesYear = data.data.map(function(earnings) {
            return earnings.years
        }, [])
        console.log(formattedSalesYear)
        setSales(formattedSales)
        for (let i=1; i<formattedSalesYear.length; i++) {
            if (formattedSalesYear[i] = formattedSalesYear[i-1]) {
                dateSet = true
            } else {
                dateSet = false
                formattedSalesYear = ["error", "error", "error", "error", "error", "error"]
                break
            }
            console.log("dateSet: "+dateSet)
        }
        if (dateSet) {
            console.log("hello")
            setSalesYear(formattedSalesYear)
        }
        console.log(salesYear)
    }, [])

    return (
        <div>
            <BarChart highcharts={Highcharts} options={config}/>
        </div>
    )
}

export default BarVis;