# Java Foundations Certification

Este repositório tem o único propósito de armazenar informações que tomei nota durante meus estudos para a realização da _Java Foundations Certification (1Z0-811)_ da _Oracle_.

Todas as fontes dos conhecimentos aqui presentes estão citadas ao final deste arquivo. Recomendo fortemente que estude por elas, tendo em vista que alguns conhecimentos podem ter sido ocultados deste _README_.

# 1. Informações sobre o exame

Neste tópico, deixei algumas informações importantes sobre o exame.

## 1.1. Características

- Duração: 150 minutos.
- Quantidade de questões: 75.
- Quantidade mínima de acertos: 65% (aproximadamente, 49 questões).
- Formato das questões: múltipla escolha.
- Preço: R$ 0.000,00 (TODO)

## 1.2. Conteúdo

* O que é _Java_?
    * Descrever as _features_ do _Java_.
    * Descrever aplicações reais em _Java_.
* Elementos basicos do _Java_
    * Convenções.
    * Palavras reservadas.
    * Comentários _single-line_ e _multi-line_.
    * Importação de pacotes.
    * Descrever o pacote `java.lang`.
* Operadores
    * Aritméticos.
    * Incremento e decremento.
    * Relacionais.
    * Atribuição.
    * Condicionais.
    * Precedencia dos operadores.
* Uso das classes `Random` e `Math`
* _Loopings_
    * Descrever estruturas de _loopings_.
    * `for`.
    * `while`.
    * `do while`.
    * Comparação entre os diferentes _loopings_.
    * `break` e `continue`;
* `Arrays` e `ArraysList`
    * Vetores de uma dimensão.
    * Criação e manipulação de `ArrayList`.
    * Iteração de listas/vetores.
    * Descrever as diferenças e semelhanças entre vetores e listas.
* Métodos
    * Descrever e criar.
    * Níveis de acesso.
    * Sobreposição de métodos.
    * Métodos estáticos.
* Base do _Java_
    * Descrever acerca da _JDK_ e _JRE_.
    * Orientação a Objetos.
    * Componentes básicos do _Java_.
    * Compilar e executar programas.
* Tipos de Dados.
    * Declaração e inicialização de variáveis e constantes.
    * Conversão de dados.
    * Variáveis `String`.
* `String`
    * Formatação (`%d`, `%n`), etc.
* Estruturas de decisão.
    * `if` e `if-else`
    * `switch`
    * Comparação entre objetos primitivos e de instância.
    * `compareTo` e `equals`.
* Tratamento de _exceptions_
    * Identificação de erros na sintaxe/lógica.
    * Tratamento de _exceptions_.
    * Exibição de _exceptions_.
    * `try-catch`.
* Classes e construtores.
    * Criação
    * Modificadores de acesso.
    * Hierarquia.
    * Escopo das variáveis.
    * Sobrecarga.

# 2. Dicas para o exame
## 2.1. Quantidade de respostas

Cada uma das questões do exame irão indicar a quantidade de questões a serem assinaladas. Escolher a resposta incorreta não reduz pontos da prova.

## 2.2. Exceções à regra

Para questões que temos pouco conhecimento sobre o assunto, e através de eliminação, chegamos a mais de uma questão, devemos considerar se existe alguma possibilidade de haver uma excessão às afirmações que temos a disposição.

Por exemplo, supondo que nas duas afirmações a seguir sejam as únicas respostas plausíveis de uma das questões:

> a) "You **cannot** do X in Java".  
> b) "You **should** not do X in Java".

Ambas indicam para não se fazer algo em Java: a primeira diz que você não **pode** fazer algo; a segunda diz que você não **deveria**.

Respostas como a primeira induzem o entendimento de que não é permitido que algo seja feito, sobre todas as hipóteses. Respostas como a segunda, indicam que algo não deveria ser feito, abrindo margem para que existam excessões à regra.

Respostas como a segunda são preferíveis no "chute", pelo fato de darem margem à exceções que provavelmente existem.

# 3. Princípios de Programação Orientada a Objetos (POO)

A `POO` é um paradigma de programação que consiste na criação de aplicações que relacionam objetos reais. Por exemplo: o carro e o motorista, o televisor e a pessoa, etc.

Em java, os objetos são representados por classes, com `fields` que representam suas características e métodos, que ditar a forma como um objeto se relaciona com outro.

## 3.1. Abstração
O processo de analisar as entidades do mundo real, tomando suas características e forma que se relacionam, no contexto da aplicação que está sendo desenvolvida é chamado de **abstração**.

## 3.2. Encapsulação
Na OOP, buscamos expor às demais entidades da aplicação somente aquilo (atributo ou ação) que seja pertinente. Não dar detalhes da implementação dos atributos (`fields`) ou ações (`métodos`) de uma entidade garante que o relacionamento dela com outras não sejam pautados na forma que ela se comporta com seus dados, evitando a criação de interdependência entre as entidades.

Como dito pelo autor [Hanumant Deshmukh](https://www.amazon.com/OCFA-Java-Foundations-Fundamentals-1Z0-811-ebook/dp/B08MVSBV86):
> "An entity should only expose the "what" and not the "how"."

Em java, a ocultação é feita através de palavras-chave que precedem a definição dos atributos e métodos das classes.

| Palavra-chave | Classe | Pacote | Classes filhas | Global |
| :-----------: | :----: | :----: | :------------: | :----: |
| `private` | ✓ | X | X | X |
| `default` | ✓ | ✓ | X | X |
| `protected` | ✓ | ✓ | ✓ | X |
| `public` | ✓ | ✓ | ✓ | ✓ |

## 3.3. Herança
A herança é a prática de concentrar características ou ações semelhantes entre entidades como sendo um objeto mais abstrato.

Frequentemente, utilizamos o conceito "é um" para identificar se uma entidade pode estar relacionada a um destes objetos que conserva as semelhanças.

## 3.4. Polimorfismo
O polimorfismo é o conceito de "várias formas". Em outras palavras, na POO, uma entidade pode ter vários formatos distintos, mas ainda deve funcionar dentro do contexto da regra de negócios da aplicação.

## 3.5. Exemplo prático

Para compreender os conceitos apresentados anteriormente, vamos acompanhar um caso real (simplificado), e aplicar os quatro pilares da POO nele.

Vamos imaginar que fomos contratados para fazer uma aplicação (simples) para um pet-shop. Nesta empresa, existem dois tipos de pessoas: os funcionários e os clientes. Um cliente pode comprar um ou vários produtos, enquanto é atendido por um dos funcionários.

Aplicando o conceito de **abstração**, podemos observar as seguintes entidades:

| Nome da entidade | Atributos | Ações |
| ---------------- | --------- | ----- |
| Funcionário | Nome, endereço, contato, salário e setor. | Vender, tosar (pet) e lavar (pet). |
| Cliente | Nome, endereço, contato, crédito na loja. | Pagar compras. |

Note que estas entidades podem ter inúmeras outras características e formas de se relacionarem, mas a questão da abstração é levantar somente aquilo que é relevante para a aplicação.

Um funcionário precisa vender para um cliente que deseja comprar. A forma que um funcionário vende não importa para o cliente, contanto que sua a venda seja concretizada. O mesmo se aplica à tosagem e lavagem dos pets.

Este é o conceito de **encapsulamento**: esconder informações que não precisam estar expostas. Logo, o cliente deveria ser capaz de utilizar o método `tosarMeuPet`, mas a forma que a tosagem é feita não interessa a ele.

Observando o negócio que estamos trabalhando, podemos notar algumas características iguais entre as entidades: nome, endereço e contato. Utilizando o conceito de **herança**, podemos concentrar estas características semelhantes em um só local, para evitar que ela precise ser declarada mais de uma vez no nosso código. Logo, teríamos as seguintes classes:

| Nome da entidade | Atributos | Ações | Relação na herança |
| ---------------- | --------- | ----- | ------------------ |
| Pessoa | Nome, endereço e contato. | - | Pai |
| Funcionário | As da Pessoa, salário e setor. | Vender, tosar (pet) e lavar (pet). | Filha |
| Cliente | As da Pessoa e o crédito na loja. | Pagar compras. | Filha |

Sabemos que o termo "pet" engloba diversos animais. Na nossa aplicação, consideramos que todos eles são iguais, não há distinção para cachorro e gato. Apesar disso, pelo conhecimento que adquirimos durante a nossa formação humana, aprendemos que existe uma diferença gigante entre estes dois animais. Este é o conceito de **polimorfismo**: um pet, pode ser considerado um animal qualquer, ou um animal em específico (gato, cobra, lagarto, etc).

Esta é a aplicação teórica dos conceitos, mas e na prática? Como escrevo isso na minha aplicação em java?

Para a entidade "Pessoa":
```java
public class Pessoa {
    public String nome;
    public String endereço;
    public String contato;

    public void cumprimentar() {
        /* Implementação do método aqui */
    }

    public void agradecer() {
        /* Implementação do método aqui */
    }
}
```

Para a entidade "Funcionário":
```java
public class Funcionario extends Pessoa {
    public double salario;
    public String setor;

    public void vender() {
        /* Implementação do método aqui */
    }

    public void tosarPet() {
        /* Implementação do método aqui */
    }

    public void lavarPet() {
        /* Implementação do método aqui */
    }
}
```

Para a entidade "Cliente":
```java
public class Cliente extends Pessoa {
    public double credito;

    public void pagar() {
        /* Implementação do método aqui */
    }
}
```

> Note que é uma boa prática ocultar os atributos da classe e expor o seu acesso através de métodos. Por intenções didáticas, não realizei a boa prática e não irei abordá-la.

Aqui, conseguimos observar que um cliente **é uma** pessoa, bem como o funcionário.

Tudo bem, defini quais são as relações, mas e agora? como as utilizo?

Para isso, criarei aqui a classe principal da minha aplicação, onde as entidades serão relacionadas.

```java
public class MyPetApp {
    public static void main(String[] args) {

        // Instanciando as entidades de formato já especificado.
        Fornecedor exemploFornecedor = new Fornecedor("José", "Rua dos Bobos, 0, Nárnia, Brasil", "jose@pets.com.br", 15000.00, "Faz tudo");

        Cliente exemploCliente = new Cliente("Paula", "Rua dos Boi Bumbá, 70, Nárnia, Brasil", "paula@paula.com.br");
        //

        // Realizando as operações comerciais
        exemploCliente.cumprimentar();
        exemploFuncionario.cumprimentar();

        exemploFuncionario.vender();
        exemploCliente.pagar();
        exemploFuncionario.agradecer();

        exemploFuncionario.tosarPet();
        exemploFuncionario.lavarPet();
        exemploCliente.agradecer();
        //
    }
}
```

# 4. Palavras reservadas

Palavras reservadas são impedidas pelo compilador de serem utilizadas pelo desenvolvedor. Elas são listadas [neste](https://www.w3schools.com/java/java_ref_keywords.asp) artigo da W3 Schools.

> Vale ressaltar que o exame não cobra o uso de todas estas palavras reservadas.

# 5. Static and instance blocks
O Java permite que o desenvolvedor defina comportamentos para uma classe quando ela for carregada pela JVM ou instanciada.
## 5.1. Static block
Os blocos estáticos são invocados apenas uma vez durante o ciclo de vida de uma aplicação: quando a JVM carrega a classe.

Sintaxe dos blocos estáticos:
```java
public class MyClass {

    static {
        System.out.println("My class has been loaded!");
    }

}
```
## 5.2. Instance block
Já os blocos de instâncias são executados sempre durante a instanciação de um novo objeto.

Sintaxe dos blocos de instância:
```java
// ParentClass.java
public class ParentClass {

    {
        System.out.println("A ParentClass instance is beeing initiated!");
    }

    ParentClass(String a) {
        System.out.println("ParentClass constructor executed!");
    }

}
//

// InstanceBlock.java 
public class InstanceBlock extends ParentClass {

    {
        System.out.println("InstanceBlock is being instantiated!");
    }

    public InstanceBlock(String a) {
        super(a);
        System.out.println("The constructor has finished!");
    }

    public static void main(String... args) {
        new InstanceBlock("");
    }
}
//
```

Na prática, o compilador do Java replica os blocos de instância, seguindo sua ordem de declaração, em todos os construtores de uma classe, após a invocação do `super()`.

Logo, o exemplo anterior, após a compilação, se torna o mesmo que:
```java
// ParentClass.class (decompiled)
public class ParentClass {
    ParentClass(String var1) {
        System.out.println("A ParentClass instance is beeing initiated!");
        System.out.println("ParentClass constructor executed!");
    }
}
//

// InstanceBlock.class (decompiled)
public class InstanceBlock extends ParentClass {
    public InstanceBlock(String var1) {
        super(var1);
        System.out.println("InstanceBlock is being instantiated!");
        System.out.println("The constructor has finished!");
    }

    public static void main(String... var0) {
        new InstanceBlock("");
    }
}
//
```

# 6. Criando um arquivo JAR
O JAR é um arquivo compactado que possui as classes necessárias para a execução de uma aplicação.

Geração de um JAR:
```
jar -cvf <arquivo.jar> <source-path>
```

Onde:
- c: create
- v: verbose
- f: output file

Caso haja um `MANIFEST.MD` dentro do jar, especificando qual das classes é a principal, pode-se executar a aplicação com o `java -jar endereco/do/arquivo.jar`

# 7. Pacotes padrões do Java

O Java possui diversos pacotes padrões em sua API. Nesta seção, os principais serão brevemente descritos.

| Pacote | Função | Classes importantes |
| ------ | ------ | ------------------- |
| `java.lang` | Pacote base para o funcionamento de qualquer aplicação java. Por padrão, ele já está importado em qualquer classe criada. | `Object`, `Math`, `System`, `Runtime` e as `wrapper classes`. |
| `java.io` | Utilizado para operações de entrada e saída de dados, como a escritura e leitura de arquivos. | `InputStream`, `OutputStream`, `FileReader` e `FileWriter`. |
| `java.net` | Fornece suporte a comunicações entre sistemas (networking). | `Socket` e `ServerSocket`. |
| `java.sql` | Permite a comunicação com bancos de dados. | `Connection`, `Statement` e `ResultSet`. |
| `java.util` | Apresenta ferramentas úteis para trabalhar com alguns tipos de dados. | `Collection`, `List`, `ArrayList`, `HashSet`, `HashMap`, `Date` e `Locale`. |
| `java.awt` e `java.swing` | Fornecem ferramentas para a criação de interfaces. | `Frame`, `Dialog`, `Button`, `ActionEvent` e `LayoutManager`. |

# 8. Iniciação de váriaveis

Variáveis locais devem ser iniciadas pelo desenvolvedor. Quando o compilador consegue determinar que uma variável LOCAL pode não ter sido iniciada no momento de seu uso, uma `exception` é exibida, impedindo que a aplicação seja compilada.

```java
public class Main {
    public static void main(String[] args) {
        int i;
        System.out.println(i); // An exception will occur at this point.
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        int i;
        int j = 10;

        if (j == 10) {
            i = 1;
        }

        System.out.println(i); // An exception will occur at this point.
    }
}
```
```java
/* Compiles */
public class Main {
    public static void main(String[] args) {
        int i;
        int j = 10;

        if (j == 10)
            i = 1;
        else
            i = 0;

        System.out.println(i);
    }
}
```

Variáveis não locais são iniciadas automaticamente. Utilizando o valor `0` para números inteiros, `0.0` para números com ponto flutuante, `false` para variáveis booleanas e `null` para as de referência.

```java
/* Compiles */
public class Main {
    static int i;
    static double d;
    static boolean b;
    static String s;

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);
    }
}
```

```java
/* Compiles */
public class Main {
    static int i;
    static double d;
    static boolean b;
    static String s;

    public static void main(String[] args) {

        AnotherClass ac = new AnotherClass();

        System.out.println(ac.i);
        System.out.println(ac.d);
        System.out.println(ac.b);
        System.out.println(ac.s);
    }
}

class AnotherClass {
    int i;
    double d;
    boolean b;
    String s;
}
```

# Tipos
Listo aqui os tipos primitivos em Java.
| TIPO      | TAMANHO |
| --------- | ------- |
| `boolean` | 1 bit   |
| `byte`    | 8 bits  |
| `char`    | 16 bits |
| `short`   | 16 bits |
| `int`     | 32 bits |
| `float`   | 32 bits |
| `long`    | 64 bits |
| `double`  | 64 bits |

# Promoção numérica
Para avaliar expressões numéricas, o Java pode realizar conversão nos valores que estão sendo utilizados nos cálculos.

## Unary operators
Quando o tamanho do tipo for menor que `int`, seu valor será convertido para `int`(32 bits).

```
public class NumericPromotion {

    public static void main(String[] args) {
        byte b = 1;
        short s = b;

        System.out.println(s);
    }

}
```

No exemplo acima, `b` é um `byte`, com tamanho e 8 bits. `short` possui 16 bits. Ou seja, `b` cabe em `s`, portanto, o código compila e exibe `1` no terminal.

```
$ javac NumericPromotion.java
$ java NumericPromotion
1
```

Ao fazer o uso de operadores unários, o java realiza a conversão do tipo para `int`, uma promoção numérica, caso o tipo da variável seja menor que `int`.

```
public class NumericPromotion {

    public static void main(String[] args) {
        byte b = 1;
        short s = -b; // linha atualizada

        System.out.println(s);
    }

}
```

Não podemos compilar este programa, dado que `int` é maior que `short`.

```
$ javac NumericPromotion.java
NumericPromotion.java:5: error: incompatible types: possible lossy conversion from int to short
        short s = -b;
                  ^
1 error
```

## Binary operators
Em operações com dois parâmetros (binary operators), as variáveis serão convertidas para para o maior tipo.

```
public class NumericPromotion {

    public static void main(String[] args) {

        int i = 1;
        long l = 1L;
        int j = i + l;

        System.out.println(j);
    }

}
```

Não podemos compilar este programa, dado que `i + l` produz um resultado em `long`, que é maior que `int`.

```
$ javac NumericPromotion.java
NumericPromotion.java:7: error: incompatible types: possible lossy conversion from long to int
        int j = i + l;
                  ^
1 error
```

## Casos especiais
Vale ressaltar que operadores unários de incremento/decremento (`--` e `++`) e de atribuição composta (`+=`, `-=` e `+=`) não seguem as regras de promoção numérica.

```java
public class NumericPromotion {

    public static void main(String[] args) {

        byte b = 1;
        b += 1;

        System.out.println(b);

        short s = --b;
        System.out.println(s);
    }

}
```

A execução desta classe irá resultar em:

```
$ javac NumericPromotion.java
2
1
```

# Operadores bitwise
São operações ao nível de bits. Utilizado para tarefas de baixo nível.

| Operador | Símbolo | Função |
| -------- | ---- | ------ |
| AND | `&`  | Altera o bit para `1` se ambos os bits forem `1`. |
| OR  | `\|` | Altera o bit para `1` se um ou ambos os bits forem `1`. |
| XOR | `^`  | Altera o bit para `1` somente se um dos bits for `1`. |
| NOT | `~`  | Inverte `1` para `0` e `0` para `1`. |
| Left shift | `<<` | Move todos os bits para a esquerda (dado no lado esquerdo) o número de vezes dado no lado direito. |
| Signed right shift | `>>` | Move todos os bits para a direita (dado no lado esquerdo) o número de vezes dado no lado direito. Preserva o sinal do número. |
| Unsigned right shift | `>>>` | Move todos os bits para a direita (dado no lado esquerdo) o número de vezes dado no lado direito. Preenche a esquerda com o 0, ou seja, será sempre positivo. |

## Exemplo
```java
public class BitwiseOperators {

    static final byte NUMBER_ONE = 0B00000001;
    static final byte NUMBER_TWO = 0B00000010;
    static final byte NUMBER_EIGHT = 0B00001000;
    static final int HIGH_NUMBER = 0B11111111;

    static final int BYTES_TO_SHIFT = 3;

    public static void main(String[] args) {

        /*
         * 00000001
         * 00000010
         * -------- (&)
         * 00000000
         */
        System.out.println("AND (&): \t\t\t" + (NUMBER_ONE & NUMBER_TWO)); // prints 0.

        /*
         * 00000001
         * 00000010
         * -------- (|)
         * 00000011
         */
        System.out.println("OR (|): \t\t\t" + (NUMBER_ONE | NUMBER_TWO)); // prints 3.

        /*
         * 00000001
         * 00000010
         * -------- (^)
         * 00000011
         */
        System.out.println("XOR (^): \t\t\t" + (NUMBER_ONE ^ NUMBER_TWO)); // prints 3.

        /*
         * 00000001
         * -------- (~)
         * 11111110
         */
        System.out.println("NOT (~): \t\t\t" + (~NUMBER_ONE)); // prints -2 because of numeric promotion (11111111 11111111 11111111 11111110).

        /*
         * 00001000
         * -------- (>> 3)
         * 00000001
         */
        System.out.println("Right shift (>>): \t\t" + (NUMBER_EIGHT >> BYTES_TO_SHIFT)); // prints 1.

        /*
         * 00001000
         * -------- (<< 3)
         * 01000000
         */
        System.out.println("Left shift (<<): \t\t" + (NUMBER_EIGHT << BYTES_TO_SHIFT)); // prints 64.

        /*
         * 11111111
         * -------- (>>> 3)
         * 00011111
         */
        System.out.println("Unsigned right shift (>>>) \t" + (HIGH_NUMBER >>> BYTES_TO_SHIFT)); // prints 31.
    }

}
```

# Ordem dos operadores.
| Operator Name (In order of precedence from High to Low) | Operator |
| ------------------------------------------------------- | -------- |
| Array access, object creation, member access, method reference | `[]`, `new`, `.`, e `::`. |
| postfix | `expr++ ` e `expr--`. |
| ¹ Unary and pre-increment/pre-decrement | `+expr`, `-expr`, `!`, `~`, `++expr` e `--expr`. |
| ¹ Cast | `()`. |
| multiplicative | `*`, `/` e `%`. |
| additive | `+` e `-`. |
| shift | `<<`, `>>` e `>>>`. |
| relational | `<`, `>`, `<=`, `>=` e `instanceof`. |
| equality | `==` e `!=`. |
| bitwise AND | `&`. |
| bitwise exclusive OR | `^`. |
| bitwise inclusive OR | `\|`. |
| logical AND && logical OR | `\|\|`. |
| ternary | `? :`. |
| ¹ Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `^=`, `\|=`, `<<=`, `>>=` e `>>>=`. |
| ¹ Lambda and switch expression | `->`. |

> ¹ These operators associate from Right to Left.

# Ordem de avaliação
O java avalia expressões da esquerda para a direita, não importa a ordem dos operadores.

```java
public class EvaluationOrder {

    public static void main(String[] args) throws Exception {
        int result = getA() + getB() + ((getException()) + getC()); // getC will not be invoked!
        System.out.println(result);
    }

    public static int getA() {
        System.out.println("Method A invoked!");
        return 1;
    }

    public static int getB() {
        System.out.println("Method B invoked!");
        return 1;
    }

    public static int getException() throws Exception {
        throw new Exception("An Exception occurred!");
    }

    public static int getC() {
        System.out.println("Method C invoked!");
        return 1;
    }

}
```
Ao executar a apliação acima, a saída será:
```
$ javac EvaluationOrder.java
$ java EvaluationOrder

Method A invoked!
Method B invoked!
Exception in thread "main" java.lang.Exception: An Exception occurred!
        at EvaluationOrder.getException(EvaluationOrder.java:18)
        at EvaluationOrder.main(EvaluationOrder.java:3)
```

# Declaração de um for
Apenas para constar, todas as seguintes estruturas de for são válidas em Java. Decidi incluir essa informação nas notas pelo fato de eu ainda não conhecer essas possibilidades.
```java
public class Main {
    public static void main(String[] args) {
        for (String s = null; s == null; System.out.println(s)) {
            s = "Hello";
        }

        System.out.println();

        for (int i = 0; true; System.out.println("Before: " + i), i++, System.out.println("After: " + i)) {
            if (i == 5)
                break;
        }

        System.out.println();

        for (System.out.println("Starting for"); true;) {
            break;
        }

        for ( /* Executado ao iniciar */ ; /* condição para decidir se o FOR deve ser executado */ ; /* Executado após cada iteração */ ) {
            break;
        }
    }
}
```

A saída da execução da aplicação acima exibe o seguinte resultado no terminal:

```
Hello

Before: 0
After: 1
Before: 1
After: 2
Before: 2
After: 3
Before: 3
After: 4
Before: 4
After: 5

Starting for
```

# Conceitos citados pelo livro para entender melhor
- [ ] `Facelets`.
- [ ] Diferença entre as linguagens procedurais e funcionais.
- [ ] Java `RMI`.
- [ ] Jakarta e Java Community Process.
- [ ] Sandbox nativa.

# Fontes
- [OCFA Java Foundations Exam Fundamentals 1Z0-811: Study guide for Oracle Certified Foundations Associate, Java Certification](https://www.amazon.com/OCFA-Java-Foundations-Fundamentals-1Z0-811-ebook/dp/B08MVSBV86).
- [Bitwise Operators in Java at GfG] (https://www.geeksforgeeks.org/bitwise-operators-in-java/).