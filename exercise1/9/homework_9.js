var myArray = [1,2,3,4,5,6,7,8,9,10];
var max = 0 ;

for (var i = 0; i < myArray.length; i++) {
	if(i==0){
		max = myArray[i];
	}

	if(max<myArray[i]){
		max = myArray[i];
	}
}
console.log("Maximum of arr is " +max);
