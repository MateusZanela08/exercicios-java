# ☕ Exercícios de Java

Exercícios que fiz aprendendo Java no curso de **Análise e Desenvolvimento de Sistemas (Unisul)**,
organizados por assunto, do mais simples ao mais completo.

## 📚 Conteúdo

### 01 · Entrada e saída

| Arquivo | O que faz |
|---|---|
| [HelloWorld](01-entrada-e-saida/HelloWorld.java) | O clássico primeiro programa: mostra "Hello World!" |
| [OlaNome](01-entrada-e-saida/OlaNome.java) | Pede o nome e responde "Olá, nome" numa janela |
| [SomaDoisNumeros](01-entrada-e-saida/SomaDoisNumeros.java) | Lê dois números e mostra a soma |

### 02 · Condicionais (`if`, `else`, `switch`)

| Arquivo | O que faz |
|---|---|
| [SomaMaiorQueDez](02-condicionais/SomaMaiorQueDez.java) | Soma dois números e avisa se o resultado passa de 10 |
| [MultiploDeDois](02-condicionais/MultiploDeDois.java) | Diz se o número é múltiplo de 2 (usa o resto da divisão `%`) |
| [MaiorNumero](02-condicionais/MaiorNumero.java) | Compara dois números: qual é maior ou se são iguais |
| [AprovacaoCredito](02-condicionais/AprovacaoCredito.java) | Aprova o crédito se a parcela for até 30% do salário |
| [CalculoIdade](02-condicionais/CalculoIdade.java) | Calcula a idade e valida se o ano de nascimento faz sentido |
| [FaixaEtaria](02-condicionais/FaixaEtaria.java) | Aceita só idades entre 15 e 25 anos (usa `&&`) |
| [Calculadora](02-condicionais/Calculadora.java) | Calculadora com menu das 4 operações usando `switch` |
| [Beecrowd1041Quadrante](02-condicionais/Beecrowd1041Quadrante.java) | Problema 1041 do Beecrowd: em qual quadrante fica o ponto (x, y) |

### 03 · Laços de repetição (`for`, `while`)

| Arquivo | O que faz |
|---|---|
| [ContarAteDez](03-lacos-de-repeticao/ContarAteDez.java) | Mostra os números de 1 a 10 |
| [NumerosPares](03-lacos-de-repeticao/NumerosPares.java) | Lista os pares entre 33 e 57 |
| [RepetirFrase](03-lacos-de-repeticao/RepetirFrase.java) | Repete uma frase quantas vezes o usuário quiser |
| [Fatorial](03-lacos-de-repeticao/Fatorial.java) | Calcula o fatorial de um número |
| [SomaComWhile](03-lacos-de-repeticao/SomaComWhile.java) | Vai somando números positivos até o usuário digitar -1 |
| [NumerosCombinados](03-lacos-de-repeticao/NumerosCombinados.java) | Todas as combinações de 1 a 4 com um `for` dentro de outro |

### 04 · Vetores e matrizes

| Arquivo | O que faz |
|---|---|
| [MediaNotas](04-vetores-e-matrizes/MediaNotas.java) | Guarda as notas num vetor e calcula a média da turma |
| [CadastroAlunos](04-vetores-e-matrizes/CadastroAlunos.java) | Cadastra nomes de alunos num vetor e mostra a lista |
| [MenuVetor](04-vetores-e-matrizes/MenuVetor.java) | Menu com 17 operações em vetor: busca, maior/menor, somas, média, inverter e ordenar |
| [MatrizAtletas](04-vetores-e-matrizes/MatrizAtletas.java) | Matriz com número e altura de atletas: o mais alto, a média e quantos têm menos de 1,78 m |

## ▶️ Como rodar

Precisa do Java 11 ou mais novo. Dentro da pasta do exercício:

```bash
java NomeDoArquivo.java
```

Alguns exercícios usam o `JOptionPane`, que abre janelinhas para digitar e mostrar os resultados.

> Observação: no Java em português, números decimais são digitados com **vírgula** (ex.: `4,5`).

---

Algoritmo mais avançado que fiz: [algoritmo-dijkstra](https://github.com/MateusZanela08/algoritmo-dijkstra) (caminho mais curto entre cidades).
