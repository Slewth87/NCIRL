import { useState, useEffect } from "react";
import axios from "axios";
import Highcharts from 'highcharts/highcharts'
import PieChart from "highcharts-react-official"

function PieVis() {
    const [earnings, setEarnings] = useState({});

    const config = {
        credits: {
            enabled: false
        },
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: 'Earnings by City'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        accessibility: {
            point: {
                valueSuffix: '%'
            }
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.percentage:.1f} %'
                }
            }
        },
        series: [{
            name: 'Earnings',
            colorByPoint: true,
            data: earnings
        }]
    }


    useEffect(async function () {
        var data = await axios.get("http://localhost:8080/earnings")
        var formattedData = data.data.map(function(earnings) {
            return {
                name: earnings.country,
                y: earnings.earnings
                }
            }
        )
        console.log(formattedData)
        
        // Timeout available to test the Loading If/Else statement at lines 62-73
        // setTimeout(() => { 
            setEarnings(formattedData)
            // ; }, 500)
    }, [])

    if (earnings.length) {
        return (
            <div>
                <PieChart highcharts={Highcharts} options={config}/>
            </div>
        )
    } else {
        return (
            <div>
                Loading. . .
            </div>
        )}
}

export default PieVis;