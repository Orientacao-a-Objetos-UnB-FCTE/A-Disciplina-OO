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


## 🔧 Instalar o Visual Studio Code (VS Code)

### ✅ Windows

1. Acesse o site oficial:
   - [Download do Visual Studio Code](https://code.visualstudio.com/Download)

2. Baixe o instalador **User Installer (x64)** para Windows.

3. Execute o instalador e, durante a instalação, marque as opções recomendadas:
   - **Add “Open with Code” action to Windows Explorer file context menu**
   - **Add “Open with Code” action to Windows Explorer directory context menu**
   - **Add to PATH**

4. Conclua a instalação e abra o VS Code pelo menu iniciar.

---

### ✅ Linux (Ubuntu/Debian)

1. Abra o terminal e execute os seguintes comandos:

   **Instalação via Snap (mais simples):**
   ```bash
   sudo snap install code --classic
   ```

   **OU Instalação via pacote .deb:**
   1. Baixe o arquivo `.deb` do site oficial:  
      [Download do VS Code (.deb)](https://code.visualstudio.com/Download)
   2. Instale com:
      ```bash
      sudo dpkg -i ~/Downloads/code_*.deb || sudo apt -f install
      ```

2. Verifique a instalação:
   ```bash
   code --version
   ```

3. Para abrir o VS Code, digite no terminal:
   ```bash
   code
   ```

---

> 🔄 **Importante:** No Windows, o VS Code atualiza automaticamente. No Ubuntu, mantenha-o atualizado com:
> ```bash
> sudo snap refresh code
> ```
> ou use seu gerenciador de pacotes.

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

