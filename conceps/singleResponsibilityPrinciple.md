# S (SRP - Single Responsibility Principle)

## Definición:

- Una clase debe implementar un único concepto y tener una única responsabilidad. Ejemplo:
    - Crear una conexión con una BD
    - Recuperar información de un BD
    - Escribir en un fichero
- Una clase sólo debería tener una razón para cambiar.

**¿Qué puede ocurrir cuando una clase hace demasiadas cosas?**

Tienes que cambiarla cada vez que una de esas cosas cambia. Y al hacerlo, te arriesgas a modificar otras partes de la clase que no pretendías cambiar.

**Trucos para identificarlas**:

- Si nos vamos a una clase, y tiene más de un método público, tendrá más de una vía de entrada a esa clase, probablemente está haciendo varias cosas (sin contar los getters y setters, claro).
- Tiene un nombre muy genérico. (ejemplo a continuación)

### Ejemplos

#### PROBLEMA:

Ej. EmailManager

```java
public class EmailManager() {
	
	public Boolean sendEmail(Email email) {
		...		
	}

	public void removeEmail(String id) {
		...		
	}
	
	public String findEmailBy(String sender) {
		...
	}
	
	...
}
```

#### SOLUCIÓN:

Clases de servicio pequeñas con objetivos muy claros y acotados.

Ej. Class EmailSender
Ej. Class EmailRemover
Ej. Class EmailFinder

#### PROBLEMA:

Class `Email.java`

```java
class Email {
	Content content; // Esto podria ser un simple String tambien
	
	public String getSender() {
		...		
	}

	public String getSubject() {
		...		
	}

	public String printContent() {
		// conversion this.content to string
		...
		// print the content already converted to String
		System.out.println(contentInStringFormat);
	}

}
```

```java
Email email = new Email(...);
email.printContent();
```

Estamos acoplando la forma de modelar el email con la forma en la que mostramos su contenido.

Tanto si cambian los datos que modelamos, como si cambia la forma en la que queremos mostrarlos (html, json....), tendremos que tocar la clase Email, cuando una cosa no tiene que ver con la otra.

#### SOLUCION:

Mover el comportamiento relacionado con la impresión a una clase separada

`Email.java`

```java
class Email {
	
	Content content; // Esto podria ser un simple String tambien

	public String getSender() {
		...		
	}

	public String getSubject() {
		...		
	}

	public String getContent() {
		return this.content;
	}

}
```

`StandardOutputPrinter.java`

```java
class StandardOutputPrinter {
	public void printEmailContent(Content content) {
		// conversion to string
		...
		// print the content already converted to String
		System.out.println(contentInStringFormat);
	}
}
```

`Main.java`

```java
Email email = new Email(...);
Content emailContent = new Content(...);
emailContent = email.getContent();
StandardOutputPrinter standardOutputPrinter = new StandardOutputPrinter(...);
standardOutputPrinter.printEmailContent(emailContent);
```


Luego incluso se podría crear una interfaz para hacer prints y que fuera implementada por [StandardOutputPrinter.java](../src/main/java/com/codingiscaring/solid/singleResponsability/exampleTwo/solution/StandardOutputPrinter.java) para mostrar por pantalla, otra que fuera JsonPrinter.java para mostrar en forma de json, html, o lo que sea.
🔗[Single responsibility principle](https://blog.cleancoder.com/uncle-bob/2014/05/08/SingleReponsibilityPrinciple.html)