var arr = [1,2,3,4,5,6,7,8,9,10];
var sum = 0 ;

for (var i = 0; i < arr.length; i++) {
	sum = sum + arr[i]; 
}

var solution = sum/arr.length;

console.log(solution);