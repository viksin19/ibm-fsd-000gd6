var c = '65';
var d = 56;
var e = 100;
console.log(c, d);
function maxi(num1, num2) {
    if (num1 > num2) {
        return num1;
    }
    else {
        return num2;
    }
}
console.log(maxi(d, e));
var lol = Array(5);
for (var i = 0; i < 5; i++) {
    lol[i] = i + 50;
}
lol.forEach(function (l) { return console.log(l); });
// in any fromat
var userobject = ["LOL",
    {
        name: "Vikram",
        id: '1'
    },
    112];
console.log(userobject[1]);
var lolobj = {
    id: '2',
    name: 'vivek'
};
console.log(lolobj);
var IBMemp = {
    id: 1,
    name: 'Jagjivandas',
    address: ' Daadar TT circle Mumbai',
    phone: 9911223344
};
console.log("address : " + IBMemp);
var _uu = {
    id: 1,
    name: 'Sanders'
};
_uu.email = "joe@email.com";
console.log(_uu);
