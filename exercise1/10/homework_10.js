var myArray = [1,2,3,4,5,6,7,8,9,10];
var min = 0 ;

for (var i = 0; i < myArray.length; i++) {
	if(i==0){
		min = myArray[i];
	}

	if(min>myArray[i]){
		min = myArray[i];
	}
}
console.log("Minimun of arr is " +min);
