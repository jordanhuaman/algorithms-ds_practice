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
    this.head = new Nodo(data, this.head)
    this.size++
  }

  insertLast(data: any) {
    let node = new Nodo(data)
    let current;

    if (!this.head) {
      // ? Solo se ejecuta si es que hay un solo elemento y tiene que insertar al inicio
      this.head = node;
    }
    else {
      current = this.head
      console.log(current.next)
      while (current.next) {
        console.log('1')
        current = current.next
      }
      current.next = node
      console.log(current)
    }
    this.size++
  }
  printListData() {
    console.log(this.head)
    let currency = this.head;

    while (currency) {
      console.log(currency.data)
      currency = currency.next
    }
  }
}

const ll = new LinkedList()
ll.insertFirst(100)
ll.insertFirst(200)
ll.insertFirst(300)
ll.insertLast(400)

ll.printListData()
//? No entiendo porque el insertLast al final el this.head ya tiene al 400
//? Creo que al igualarlo `current = this.head` el this.head se convierte en current
//? Explicacion 
// current no se convierte en this.head, sino que apunta al mismo objeto al que this.head apunta.
// Esto significa que cualquier cambio que hagas a través de current también afectará a this.head y viceversa.