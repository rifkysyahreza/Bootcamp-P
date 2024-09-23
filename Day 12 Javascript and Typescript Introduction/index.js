// Area of Rectangle
let length = 5;
let width = 3;

console.log("Area of Rectangle is: " + length * width);

// Diameter, Circumference and Area of Circle
let radius = 5;
let diameter = radius * 2;
let circumference = 2 * 3.14 * radius;
let area = 3.14 * radius * radius;

console.log(
  `Diameter: ${diameter}, Circumference: ${circumference} and Area: ${area}`
);

// Angle of Triangle
let angleOne = 80;
let angleTwo = 65;

let angleThree = 180 - (angleOne + angleTwo);
console.log(`Angle of Triangle is: ${angleThree}`);

// Difference Between Dates in days
let date1 = new Date("2021-06-01");
let date2 = new Date("2021-06-10");

let difference = date2.getDate() - date1.getDate();
console.log(`Difference between dates is: ${difference} days`);

// Print Name Initials
let fullName = "John Doe";
let nameArray = fullName.split(" ");

for (let name of nameArray) {
  process.stdout.write(name[0]);
}
