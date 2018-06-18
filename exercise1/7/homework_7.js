var input = 5;

for(var i=0; i<input; i++){
	var a = input - i;

	for (var j=0; j<=a; j++){
		process.stdout.write(" ");
	}

	var b = i - 1;

	for (var k=0; k<=b ; k++) {
		process.stdout.write("*");
	}

	process.stdout.write("*");

	for (var k=0; k<=b ; k++) {
		process.stdout.write("*");
	}

	console.log("");
}