 🧠 Actividad de Lógica Computacional

¡Bienvenido a la actividad de lógica computacional! Este proyecto en Java está diseñado para practicar y aplicar conceptos fundamentales de lógica de programación mediante una serie de ejercicios prácticos. Cada ejercicio resuelve un problema específico y te ayudará a mejorar tus habilidades en Java.

## 🎯 Ejercicios Incluidos

1. **📏 Perímetro de un Polígono Regular**
   - Calcula el perímetro de un polígono regular con 6 lados dado el valor de un lado.

2. **💼 Cálculo de Nómina Semanal**
   - Calcula la nómina semanal para 5 obreros, considerando el valor de la hora y el número de horas trabajadas.

3. **🔢 División de un Número en Dígitos**
   - Divide un número entero positivo en 5 dígitos y eleva al cuadrado el primer y último dígito.

4. **📅 Conversión de Décadas a Días**
   - Convierte un número de décadas en días.

5. **⚗️ Cálculo de Masa de un Gas**
   - Calcula la masa de un gas utilizando una fórmula que relaciona presión, volumen y temperatura.

6. **💓 Número de Pulsaciones**
   - Calcula el número de pulsaciones necesarias por cada 10 segundos de ejercicio usando la edad de una persona.

7. **🌡️ Conversión de Fahrenheit a Celsius**
   - Convierte una temperatura de grados Fahrenheit a grados Celsius.

8. **🌡️ Conversión de Celsius a Fahrenheit**
   - Convierte una temperatura de grados Celsius a grados Fahrenheit.

## 🛠️ Código

Cada ejercicio está implementado en su propia clase dentro del paquete `javaapplication29`. Asegúrate de tener todos los archivos necesarios en el mismo directorio o proyecto para que el programa funcione correctamente.

### Ejemplo de Código: `ejer8.java`

```java
package javaapplication29;

import javax.swing.JOptionPane;

public class ejer8 {
    
    public void ejer8() {
        // Convertir Centígrados a Fahrenheit
        System.out.println("8. Convertir Centígrados a Fahrenheit");

        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite el número en grados Celsius:"));

        // Aplicar la fórmula de conversión
        int fahrenheit = (9 * c / 5) + 32;

        // Mostrar el resultado
        System.out.println("El resultado en grados Fahrenheit es: " + fahrenheit);
    }
}
🚀 Instrucciones de Ejecución
Compilar el Código:

Asegúrate de que Java esté instalado en tu sistema.
Usa el comando javac para compilar todos los archivos:
bash
Copiar código
javac *.java
Ejecutar el Programa:

Usa el comando java para ejecutar la clase principal, o ejecuta cada clase individualmente según el ejercicio que desees probar:
bash
Copiar código
java JavaApplication29
Interacción:

Sigue las instrucciones en la consola o en los cuadros de diálogo para ingresar los datos necesarios y ver los resultados.
📋 Requisitos
Java Development Kit (JDK) 8 o superior.
Un entorno de desarrollo Java (IDE) o un compilador de línea de comandos.
👤 Autor
Rafael Corredor Gambín
