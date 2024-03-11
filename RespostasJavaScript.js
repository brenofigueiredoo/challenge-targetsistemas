// 1) Ao final do processamento, qual será o valor da variável SOMA?
const valorDaVariavelSoma = (indice) => {
  let soma = 0;
  let k = 0;

  while (k < indice) {
    k = k + 1;
    soma = soma + k;
  }

  return soma;
};
console.log("1) O valor da variável SOMA será: ", valorDaVariavelSoma(13));

// 2)
const verificaFibonacci = (numero) => {
  let fibonacci = [0, 1];
  let i = 2;

  while (fibonacci[i - 1] + fibonacci[i - 2] <= numero) {
    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    i++;
  }

  if (fibonacci.includes(numero)) {
    return `O número ${numero} pertence à sequência de Fibonacci.`;
  } else {
    return `O número ${numero} não pertence à sequência de Fibonacci.`;
  }
};

console.log("2)", verificaFibonacci(21));
console.log("2)", verificaFibonacci(22));

// 3) Descubra a lógica e complete o próximo elemento:
const descobrirProxElemento = () => {
  console.log("3)");

  // a) 1, 3, 5, 7, ___
  console.log("- a) 9");

  // b) 2, 4, 8, 16, 32, 64, ____
  console.log("- b) 128");

  // c) 0, 1, 4, 9, 16, 25, 36, ____
  console.log("- c) 49");

  // d) 4, 16, 36, 64, ____
  console.log("- d) 100");

  // e) 1, 1, 2, 3, 5, 8, ____
  console.log("- e) 13");

  // f) 2,10, 12, 16, 17, 18, 19, ____
  console.log("- f) 20");
};
descobrirProxElemento();

// 4)
console.log("4)");
console.log("- 1 Primeira ida:");
console.log("-- Ligue o primeiro interruptor e aguarde alguns minutos.");
console.log(
  "-- Desligue o primeiro interruptor e ligue o segundo interruptor."
);
console.log("-- Entre na sala onde estão as lâmpadas.");
console.log("- 2 Segunda ida:");
console.log("-- Observe as lâmpadas.");
console.log(
  "-- A lâmpada que estiver acesa pertencerá ao interruptor que foi ligado inicialmente."
);
console.log(
  "-- Toque na lâmpada para verificar se ela ainda está quente. Se estiver, pertencerá ao segundo interruptor que foi ligado temporariamente. Se estiver fria, pertencerá ao último interruptor."
);

// 5) Escreva um programa que inverta os caracteres de um string.
const inverterString = (str) => {
  let invertedString = "";

  for (let i = str.length - 1; i >= 0; i--) {
    invertedString += str[i];
  }

  return invertedString;
};

const stringOriginal = "Estágio Ribeirão Preto - 2024";
const stringInvertida = inverterString(stringOriginal);
console.log("5)");
console.log("- String original:", stringOriginal);
console.log("- String invertida:", stringInvertida);
//
