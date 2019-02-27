public class App{
public static void main(String[] args){
	Grafo g = new Grafo (7);
	Grafo g2 = new Grafo(8);
	Grafo p = new Grafo(2);
	System.out.println("Esta es la linea añadida");
	System.out.println("Esta es la segunda linea añadida");

	/*g.insertarArista("S","A","a");
	g.insertarArista("S","C","b");
	g.insertarArista("S","F","d");
	g.insertarArista("S","D","c");
	
	
	g.insertarArista("A","B", "b");
	
	
	g.insertarArista("B", "B", "b");
	g.insertarArista("B","F","c,d");
	
	g.insertarArista("C", "D", "a");
	
	g.insertarArista("D", "S", "a");
	g.insertarArista("D", "E", "c");
	
	g.insertarArista("E", "F", "b");
	
	g.seleccionarInitialState("p0");
	g.seleccionarFinalStates("p6");
	
	g.representar();
	g.resultado();
	//Segundo grafo ejemplo
	g2.insertarArista("p0", "p1", "a");
	g2.representar();
	
*/
	p.insertarArista("p0", "p1", "0");
	p.insertarArista("p0", "p0", "1");
	p.insertarArista("p1","p1","0,1");
	p.seleccionarInitialState("p0");
	p.seleccionarFinalStates("p1");
	p.representar();
	p.resultado();
}
}

