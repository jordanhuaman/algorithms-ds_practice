interface Empleado {
  key: number;
  nombre: string;
  salario: number;
}

class TableForm1 {
  private slots: (Empleado | null)[]
  constructor(m: number) {
    this.slots = Array(m).fill(null);
  }

  insert(e: Empleado): void {
    this.slots[e.key] = e;
  }

  search(k: number): Empleado | null {
    return this.slots[k];
  }

  delete(k: number): void {
    this.slots[k] = null;
  }
}