package uno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ActUnoTests {

	@Test //Esto es obligatorio antes de cada método.
	void test() { //Los test son void. No importa el tipo de dato que testees.
		//y necesitan todos diferentes nombres.
		assertTrue( ActUno.calcularLongitud("String de prueba, largo 26")==26);
		//assertTrue es la única funcion que vamos a usar. Lo que hace es comprobar si
		//la condición que tiene de parámetro es verdadera(true) y si lo es, devuelve luz verde.
	}
	
	@Test
	void test0() {
		
		assertTrue( ActUno.calcularLongitud("String de prueba n2, largo 29")==29);
		
	}
	@Test
	void test1() {
		assertTrue( ActUno.calcularLongitud("Pablito clavo un clavito, cuantos clavitos clavo pablito?")==57);
	}
	@Test
	void test2() {
		assertTrue(ActUno.calcularLongitud("Lorem ipsum dolor sit amet consectetur adipiscing elit vitae porta sodales, ad lobortis molestie quam elementum habitasse libero himenaeos at viverra, iaculis nam vel ultrices commodo gravida nec nulla cras. Aliquet blandit tellus mauris diam ullamcorper leo curae, semper etiam pulvinar taciti mus penatibus, cum metus conubia platea tempor auctor")==348);
	}
	@Test
	void test3() {
		assertTrue(ActUno.calcularLongitud("Lorem ipsum dolor sit amet, consectetur adipiscing elit, justo orci blandit. Senectus id taciti velit phasellus hac interdum venenatis vivamus, himenaeos consequat gravida proin mauris torquent ultricies mollis, dictumst curae maecenas sed sociosqu penatibus eget. Dictum molestie eu facilisi imperdiet bibendum diam placerat curabitur conubia fusce montes cubilia massa habitasse duis pretium, tortor scelerisque lectus dignissim nisl porttitor felis purus vitae dapibus quam suscipit leo sapien. Nibh feugiat morbi viverra vulputate tincidunt lacinia porta, pharetra mi etiam aenean mus in")==591);
	}
	@Test
	void test4() {
		assertTrue(ActUno.calcularLongitud("Lorem ipsum dolor sit amet consectetur adipiscing elit vehicula montes eu, magnis risus vulputate curae at elementum ullamcorper mi rutrum, semper habitasse suscipit accumsan primis potenti nibh senectus fusce. Neque proin sodales mus tortor nisl pharetra volutpat, natoque lobortis tellus venenatis erat etiam, vivamus velit ac nulla praesent faucibus. Diam sollicitudin sapien hendrerit integer turpis cum donec a vestibulum, bibendum ultrices condimentum varius nostra purus sed curabitur tristique, lectus fames quam dignissim ut morbi consequat mauris. Posuere cubilia sociosqu dapibus dictumst est iaculis ligula inceptos, ornare dui pulvinar habitant himenaeos facilisi porta metus, feugiat penatibus lacinia ridiculus ultricies urna malesuada")==750);
	}
	
}
