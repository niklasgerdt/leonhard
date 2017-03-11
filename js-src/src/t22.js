const fs = require('fs')

const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

function sumOfChars(a){
				const v = 
								loopArr(
												sort(
																toArr(
																				stripQuotes(a))), 0);
				return v;
};

function read(){
				const data = fs.readFileSync('./src/p022_names.txt', 'utf8');
				return data;
}

function stripQuotes(data){
				return data.replace(/"/g,'');
}

function toArr(data){
				return data.split(",");
}

function sort(arr){
				return arr.sort();
}

function index(c){
				return chars.indexOf(c) + 1;
}

function loopName(n, i){
				var s = 0;
				if (n.length > i)
								s = index(n.charAt(i)) + loopName(n, i+1);
				return s;
}

function loopArr(arr, i){
				var s = 0;
				if (arr.length > i)
								s = loopName(arr[i], 0) * (i+1) + loopArr(arr, i+1);
				return s;
}

module.exports.index = index;
module.exports.loopName = loopName;
module.exports.loopArr = loopArr;
module.exports.read = read;
module.exports.sumOfChars = sumOfChars;
