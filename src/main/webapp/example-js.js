$("#delButton").click(function(){
	console.log('delete');
});

// specify the columns
var columnDefs = [
    {headerName: "Activity", field: "activity"},
    {headerName: "First Name", field: "first"},
    {headerName: "Last Name", field: "last"},
    {headerName: "Start", field: "start"},
    {headerName: "Finish", field: "finish"},
    {headerName: "Status", field: "status"}
];


var gridOptions = {
    columnDefs: columnDefs,
    rowData: null,
    onGridReady: function () {
        gridOptions.api.sizeColumnsToFit();
    }
};


$.ajax({
	url:'http://localhost:8080/employees/all',   
  //url: 'sample.json', 
	method: 'get',
	dataType:'json',
	success:function(result){
		console.log("test"+result);
		gridOptions.api.setRowData(result);
}
	
});


// wait for the document to be loaded, otherwise
// ag-Grid will not find the div in the document.
document.addEventListener("DOMContentLoaded", function() {

    // lookup the container we want the Grid to use
    var eGridDiv = document.querySelector('#myGrid');

    // create the grid passing in the div to use together with the columns & data we want to use
    new agGrid.Grid(eGridDiv, gridOptions);
console.log("test");
  
});
