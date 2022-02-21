# Questao 2 - Senha 

Algoritmo em Java que faz a leitura de uma senha com entrada do tipo `string` e verifica se a senha está de acordo com as regras abaixo:


**Ter no mínimo 6 caracteres** - Verificação feita no método `isSenhaValida()`
 
**Ter no mínimo 1 dígito** - Verificação feita no método `isNumero()`

**Ter no mínimo 1 letra  maíscula** - Verificação feita no método `isMaiusculo()`

**Ter no mínimo 1 letra em minúscula** - Verificação feita no método `isMinusculo()`

**Ter no mínimo 1 caractere especial** - Verificação feita no método `isCaracterEspecial()`

              

### Exemplo: 

_Input:_  `dd`

_Output:_
```
Faltam 4 caracteres para senha segura.

A senha precisa ter no mínimo 1 dígito.

A senha precisa ter no mínimo 1 letra em maiúsculo.

A senha precisa ter no mínimo 1 letra em minúsculo.

A senha precisa ter no mínimo 1 caractere especial.

Não é uma senha segura.

```
