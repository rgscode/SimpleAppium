#language:pt
#encoding:utf-8


@smoke
Funcionalidade: Testar a calculadora

  Esquema do Cenário: Somar com sucesso
    Dado que aperto o botão <N1>
    Quando eu aperto o botão somar
    E informo o valor <N2>
    Então o resultado deve ser <Resultado>

    Exemplos:
      | N1  | N2  | Resultado |
      | 1   | 1   | "2"       |
      | 2   | 2   | "4"       |
      | 3   | 3   | "6"       |
      | 4   | 4   | "8"       |
      | 5   | 5   | "10"      |
      | 6   | 10  | "16"      |
      | 7   | 7   | "14"      |
      | 8   | 8   | "16"      |
      | 9   | 90  | "99"      |
      | 10  | 500 | "510"     |

  Cenario: Somar numeros randomicos com sucesso
    Dado que informo o primeiro valor randomico
    Quando eu aperto o botão somar
    E informo o segundo valor randomico
    Então o resultado deve ser a soma dos valores randomicos