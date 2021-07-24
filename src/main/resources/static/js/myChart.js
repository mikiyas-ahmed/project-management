var chartData = JSON.parse(decodeHtml(projectChart));

var chartLabels = [];
var chartValues = [];

for(var i = 0; i < chartData.length; i++){
	chartLabels[i] = chartData[i].label;
	chartValues[i] = chartData[i].value;	
}

 new Chart(document.getElementById("myPieChart"), {
	type: 'pie' ,
			
	data: {
		  labels: chartLabels,
		  datasets: [{
		    label: 'My First Dataset',
		    backgroundColor: ['rgb(255, 99, 132)','rgb(54, 162, 235)','rgb(255, 205, 86)'],
		    data: chartValues,
		  }]
	},
	options: {}
});

function decodeHtml(html) {
	var txt = document.createElement('textarea');
	txt.innerHTML = html;
	return txt.value;
}
