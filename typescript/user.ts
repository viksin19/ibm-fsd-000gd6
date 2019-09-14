//  Interface


interface Flights {
    Fname:string
    source:string
    destination:string
    days:string 
}

interface  Flighttype {
    Economic:boolean
    Business:boolean
}

interface Fare {
cost:number
}

interface Flightbooking extends Flights , Flighttype , Fare {
    Pname:string
    Page:number
    Pmobile:number
}

const Indigo6E:Flightbooking [] =[{
Fname: '6E I55',
source: 'Bangalore',
destination: 'Mumbai',
days: 'Monday',
Economic: true,
Business: false,
cost: 2500,
Pname:'Vikram Singh',
Page: 23,
Pmobile:9876543210
},
{
    Fname: '6E I35',
    source: 'Bangalore',
    destination: 'Varanasi',
    days: 'Monday',
    Economic: true,
    Business: false,
    cost: 4500,
    Pname:'Ankit Singhania',
    Page: 35,
    Pmobile:9867673210
},
{
        Fname: '6E I45',
        source: 'Delhi',
        destination: 'Mumbai',
        days: 'Tuesday',
        Economic: true,
        Business: false,
        cost: 2560,
        Pname:'Vishal Singh',
        Page: 28,
        Pmobile:9876545210
}]

 Indigo6E.forEach(e=>console.log(e)); 