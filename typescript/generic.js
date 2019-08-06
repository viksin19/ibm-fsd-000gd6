var carDetails = {
    enginetype: 'diesel',
    power: '600hp',
    suspension: '80ng',
    Modal: 'BMW NEW 3 SERIES',
    type: 'Lux'
};
var busDetails = {
    enginetype: 'diesel',
    power: '1600hp',
    suspension: '180ng',
    noofSeats: 60,
    sleepertype: 'Sleeper'
};
var bikeDetails = {
    enginetype: 'diesel',
    power: '400hp',
    suspension: '80ng',
    diskbreak: true,
    modal: 'BMW'
};

var Vehicle = /** @class */ (function () {
    function Vehicle(automobile) {
        this.automobile = automobile;
    }
    Vehicle.prototype.getDetails = function () {
        return this.automobile;
    };
    return Vehicle;
}());
console.log("***** Car Details *****");
var carobj = new Vehicle(carDetails);
console.log(carobj.getDetails());
console.log("***** Bus Details *****");
var busobj = new Vehicle(busDetails);
console.log(busobj.getDetails());
console.log("***** Bike Details *****");
var bikeobj = new Vehicle(bikeDetails);
console.log(bikeobj.getDetails());
