import { useState, useEffect } from "react";
import axios from "axios";
import Highcharts from 'highcharts/highcharts';
import LineChart from 'highcharts-react-official';

function LineVis() {
    const [sales,setSales] = useState([]);
    const [salesYear,setSalesYear] = useState([]);
    const config = {
        credits: {
            enabled: false
        },

        title: {
            text: 'Earnings by year, per City'
        },
    
        yAxis: {
            title: {
                text: '€'
            }
        },
    
        xAxis: {
            accessibility: {
                rangeDescription: 'Range: 2010 to current'
            }
        },
    
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle'
        },
    
        plotOptions: {
            series: {
                label: {
                    connectorAllowed: false
                },
                pointStart: 2010
            }
        },
    
        series: sales,
    
        responsive: {
            rules: [{
                condition: {
                    maxWidth: 500
                },
                chartOptions: {
                    legend: {
                        layout: 'horizontal',
                        align: 'center',
                        verticalAlign: 'bottom'
                    }
                }
            }]
        }
    
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
            <LineChart highcharts={Highcharts} options={config}/>
        </div>
    )
}

export default LineVis;