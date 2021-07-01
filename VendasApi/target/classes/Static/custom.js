//alert('working');

function totalVendas(){
	var totalVendas = document.getElementById("totalVendas");
	//alert(totalVendas);
}

var array = [10,20];
somaTotal(array);
function somaTotal(array){	
	var total = 0;	
	for (var i=0; i<array.length; i++){	
		total = total+array[i];	
	}
	
	//alert(total);

}

window.onload = totalVendas();