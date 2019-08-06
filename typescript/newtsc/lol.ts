let c:string ='65';
let d= 56;
let e = 100;
console.log(c,d);



function maxi(num1,num2):number{
if(num1>num2){
    return num1;
}else{
    return num2;
}

}
console.log(maxi(d,e));

let lol:number[] = Array(5);
for( let i = 0; i<5; i++){
    lol[i] = i+50;
}

lol.forEach(l=>console.log(l));


// in any fromat

let userobject:any[] = ["LOL",
{
   name: "Vikram",
   id: '1'
},
112]

console.log(userobject[1]);
let lolobj:any = {
    id: '2',
    name: 'vivek'
}
console.log(lolobj);



// interfaces

interface LOL {
    id:number,
    name: string,      //mandatory field
    address?: any       //  ?optional field with any format or datatype
    phone : number | string     // can accept either number or string
}

let IBMemp:LOL = {
    id: 1,
    name: 'Jagjivandas',
    address: ' Daadar TT circle Mumbai',   //optional field 
    phone: 9911223344
}
console.log(`address : ${IBMemp}`);


let _uu:any = {
    id: 1,
    name : 'Sanders'
}
_uu.email = "joe@email.com";

console.log(_uu);




// module

