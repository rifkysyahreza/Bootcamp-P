// Area of a rectangle
let l: number = 5;
let w: number = 3;

console.log(`Area of rectangle is ${l * w}`);

// Diameter, Circumference and Area of a circle
let r: number = 5;
const pi: number = 3.14;
let d: number = 2 * r;
let c: number = 2 * pi * r;
let a: number = pi * r * r;

console.log(`Diameter: ${d}, Circumference: ${c}, Area: ${a}`);

// Angle of Triangle
let a1: number = 80;
let a2: number = 65;

console.log(`Third angle of triangle is ${180 - (a1 + a2)}`);

// Get Difference Between 2 Dates
let date1: Date = new Date("2021-01-01");
let date2: Date = new Date("2021-12-31");
let diff: number = date2.getTime() - date1.getTime();
let days: number = diff / (1000 * 3600 * 24);

console.log(`Difference between dates is ${days} days`);

// Get Initial From Name
let fullName: string = "John Doe";
let initials: string = fullName
  .split(" ")
  .map((nameElement: string) => nameElement[0])
  .join("");

console.log(`Initials of ${fullName} is ${initials}`);
