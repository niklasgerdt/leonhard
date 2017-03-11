
const should = require("should");
const t22 = require("../target/t22");

describe("prob 22", function(){

				it("index fetches char order", function(){
								const a = t22.index('A');
								a.should.equal(1);
								const k = t22.index('K');
								k.should.equal(11);
				});

				it("loop name returns sum", function(){
								const aa = t22.loopName("AA", 0);
								aa.should.equal(2);
								const ok = t22.loopName("OK", 0);
								ok.should.equal(26);
				});

				it("loop arr returns sum", function(){
								var a = ['AA','OK'];
								const b = t22.loopArr(a, 0);
								b.should.equal(54);
				});

				it("simplified case", function(){
								const a = '"AA","OK"';
								const v = t22.sumOfChars(a);
								v.should.equal(54);
				});


});
