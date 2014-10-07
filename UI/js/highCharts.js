/**
 * Created by davidliou on 10/4/14.
 */

$('#electricChart').highcharts({
    title: {
        text: 'Monthly Electric Usage',
        x: -20 //center
    },
    xAxis: {
        categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
            'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    },
    yAxis: {
        title: {
            text: 'Gallons used'
        },
        plotLines: [{
            value: 0,
            width: 1,
            color: '#808080'
        }]
    },
    tooltip: {
        valueSuffix: 'kW'
    },
    legend: {
        layout: 'vertical',
        align: 'right',
        verticalAlign: 'middle',
        borderWidth: 0
    },
    series: [{
        name: 'Electricty Usage',
        data: [72, 24, 38, 35, 78, 45, 23, 45, 77, 78, 89, 50]
    }]
});


$('#waterChart').highcharts({
    title: {
        text: 'Monthly Water Usage',
        x: -20 //center
    },
    xAxis: {
        categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
            'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    },
    yAxis: {
        title: {
            text: 'Gallons used'
        },
        plotLines: [{
            value: 0,
            width: 1,
            color: '#808080'
        }]
    },
    tooltip: {
        valueSuffix: 'Gallons'
    },
    legend: {
        layout: 'vertical',
        align: 'right',
        verticalAlign: 'middle',
        borderWidth: 0
    },
    series: [{
        name: 'Water Used',
        data: [72, 24, 38, 35, 78, 45, 23, 45, 77, 78, 89, 50]
    }]
});

$('#tempChart').highcharts({
    title: {
        text: 'Daily Temperature',
        x: -20 //center
    },
    xAxis: {
        categories: ['12:00', '1:00', '2:00', '3:00', '4:00', '5:00',
            '6:00', '7:00', '8:00', '9:00', '10:00', '11:00']
    },
    yAxis: {
        title: {
            text: 'Tempature (°F)'
        },
        plotLines: [{
            value: 0,
            width: 1,
            color: '#808080'
        }]
    },
    tooltip: {
        valueSuffix: '°F'
    },
    legend: {
        layout: 'vertical',
        align: 'right',
        verticalAlign: 'middle',
        borderWidth: 0
    },
    series: [{
        name: 'Temperature',
        data: [72, 24, 38, 35, 78, 45, 23, 45, 77, 78, 89, 50]
    }]
});



/*
 Resources
 High Charts
 http://www.highcharts.com/demo/line-basic
 Bootstrap API
 http://getbootstrap.com/css/#overview
 */