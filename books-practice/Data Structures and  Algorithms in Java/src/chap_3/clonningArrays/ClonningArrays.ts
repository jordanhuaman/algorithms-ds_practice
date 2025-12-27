const data = [1,2,3,4];
const backup = [...data];
const backup2 = data.slice();
const backup3 = Array.from(data);

data.push(2)
console.log(data)
console.log(backup);
console.log(backup2)
console.log(backup3);