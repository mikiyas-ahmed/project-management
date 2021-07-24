 new Chart(document.getElementById("myPieChart"), {
	type: 'pie' ,
			
	data: {
		  labels: ['Red','Blue','Yellow'],
		  datasets: [{
		    label: 'My First Dataset',
		    backgroundColor: ['rgb(255, 99, 132)','rgb(54, 162, 235)','rgb(255, 205, 86)'],
		    borderColor: 'rgb(255, 99, 132)',
		    data: [5, 10, 5],
		  }]
	},
	options: {}
});