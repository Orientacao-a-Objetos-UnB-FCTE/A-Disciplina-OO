# 🛠️ Preparando o Ambiente: Eclipse + Java (11+)

Este guia explica como configurar seu ambiente de desenvolvimento no **Windows**, **Linux** e **macOS** para utilizar o **Eclipse IDE** com **Java 11 ou superior**.

---

## 🔧 1. Instalar o Java (JDK)

### Windows/Linux/macOS

1. Acesse o site oficial da **Eclipse Foundation** (Eclipse IDE).
   - [Download do Eclipse 2025-03 IDE (Java)](https://www.eclipse.org/downloads/packages/)

2. Baixe e instale a versão do JDK compatível (Java 17 é uma ótima opção).

3. Verifique se a instalação foi bem-sucedida:

```bash
java -version
```
O terminal deve exibir algo como:
```bash
java version "17.0.8" 2023-07-18 LTS
```

> 🔍 **Dica:** Caso o comando não funcione, adicione o Java à variável de ambiente `PATH`.

---

## 🔧 2. Instalar o Eclipse IDE

1. Acesse o site oficial:
   - [Download do Eclipse IDE](https://www.eclipse.org/downloads/packages/)

2. Baixe o instalador apropriado para o seu sistema operacional.

3. Durante a instalação, escolha a opção **Eclipse IDE for Java Developers**.

4. Complete a instalação normalmente.

> 🔄 **Importante:** Sempre mantenha seu Eclipse atualizado para aproveitar novas funcionalidades e correções de bugs.

---

## 🔧 3. Configuração Inicial do Eclipse

1. Abra o Eclipse.
2. Selecione o **workspace** (pasta onde seus projetos ficarão salvos).
3. Configure o **Java Runtime Environment (JRE)** para garantir que o Eclipse use o Java correto:

   - Menu: `Window` > `Preferences` > `Java` > `Installed JREs`
   - Clique em **Add...** e adicione o diretório do seu JDK instalado.

4. Pronto! Agora você pode criar seus projetos em Java.

---

## 🔹 Comandos úteis para instalação via terminal

### Linux (Ubuntu/Debian)
```bash
sudo apt update
sudo apt install openjdk-17-jdk
```

### macOS (Homebrew)
```bash
brew install openjdk@17
brew install --cask eclipse-java
```

### Windows
- Baixe manualmente pelo site e execute o instalador.

> 🔗 **Dica Mac/Linux:** Lembre-se de adicionar o JDK ao PATH e configurar o JAVA_HOME.

---

# 🚀 Pronto para codar!
Agora você está com o ambiente preparado para desenvolver seus projetos em Java com o Eclipse! 🚀

