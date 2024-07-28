class Person {
  private name: string
  private info: number
  constructor(name: string, age: number) {
    this.name = name;
    this.info = age
  }
}

class Varon {
  private readonly gender = "masculino";
  private info: any
  constructor() {
    this.info = null
  }
  insertPerson(name: string, age: number) {
    this.info = new Person(name, this.info)
  }
}

const poo1 = new Varon()
poo1.insertPerson('fernando', 23)
poo1.insertPerson('arentibo', 23)
poo1.insertPerson('aurelio', 23)
console.log(poo1)