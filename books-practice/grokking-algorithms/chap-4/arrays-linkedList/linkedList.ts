class Nodo {
  private data: any;
  private next: any;
  constructor(data, next = null) {
    this.data = data;
    this.next = next
  }
}

class LinkedList {
  private head: any;
  private size: number;
  constructor() {
    this.head = null;
    this.size = 0
  }

/**
 * 
 * @param head 
 * 1. Inicia con null y eso se pasa a la clase nodo
 * 2. Head toma el anterior objeto que se mando, ya no es null
 * ? Cada ves que instanciamos un nuevo objeto, ahi si se reiniciara las variables
 * ? Para este caso solo estamos llamando a una funcion y atributos cambian, sin reiniciarse
 */
  insertFirst(data: any) {
    console.log(this.head)
    this.head = new Nodo(data, this.head)
  }

  printListData() {
    let current = this.head;
    console.log(this.head)
    while (current) {
      console.log(current.data)
      current = current.next
    }
  }
}

const ll = new LinkedList()
ll.insertFirst(100)
ll.insertFirst(200)
ll.insertFirst(300)

ll.printListData()