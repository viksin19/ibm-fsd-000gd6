// generic
interface AutoMobile {
    enginetype:string
    power:string
    suspension:string
}

interface Car extends AutoMobile {
    Modal:string
    type:string
}
interface Bus extends AutoMobile {
    noofSeats:number
    sleepertype:string
}

interface Bike extends AutoMobile {
    diskbreak:boolean
    modal:string
}

const carDetails = {
    enginetype:'diesel',
    power:'600hp',
    suspension:'80ng',
    Modal:'BMW NEW 3 SERIES',
    type:'Lux'
}

const busDetails = {
    enginetype:'diesel',
    power:'1600hp',
    suspension:'180ng',
    noofSeats:60,
    sleepertype:'Sleeper'
}

const bikeDetails = {
    enginetype:'diesel',
    power:'400hp',
    suspension:'80ng',
    diskbreak: true,
    modal:'BMW'
}

class Vehicle <AM extends AutoMobile>{
    automobile:AM
    constructor(automobile:AM){
        this.automobile = automobile
    }
    getDetails():AM{
        return this.automobile
    }
}


console.log("***** Car Details *****");
const carobj = new Vehicle<Car>(carDetails)
console.log(carobj.getDetails());


console.log("***** Bus Details *****");
const busobj = new Vehicle<Bus>(busDetails)
console.log(busobj.getDetails());


console.log("***** Bike Details *****");
const bikeobj = new Vehicle<Bike>(bikeDetails)
console.log(bikeobj.getDetails());