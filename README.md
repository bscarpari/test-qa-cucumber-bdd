<a name="readme-top"></a>

<img alt="Header" width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=7B61FF&height=180&section=header&text=BDD%20Test%20Automation&fontSize=38&fontColor=ffffff&fontAlignY=32&desc=Cucumber%20%C2%B7%20Selenium%20%C2%B7%20Java%2017%20%C2%B7%20Allure&descAlignY=52&descSize=16"/>

<h3 align="center">Behaviour-driven UI automation with Cucumber and Selenium</h3>

<p align="center">
  <a href="https://www.linkedin.com/in/bscarpari/">
    <img alt="Made by" src="https://img.shields.io/badge/-Bruno%20Scarpari-blue?style=flat-square&logo=Linkedin&logoColor=white">
  </a>

  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/bscarpari/test-qa-cucumber-bdd?style=flat-square">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/bscarpari/test-qa-cucumber-bdd?style=flat-square">

  <a href="https://github.com/bscarpari/test-qa-cucumber-bdd/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/bscarpari/test-qa-cucumber-bdd?style=flat-square">
  </a>

  <img alt="License" src="https://img.shields.io/github/license/bscarpari/test-qa-cucumber-bdd?style=flat-square">
</p>

<p align="center">
  <a href="#-about">About</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-coverage">Coverage</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-getting-started">Getting started</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-reports">Reports</a>
</p>

<!-- PLACEHOLDER: screenshot do relatório Allure com os cenários Gherkin.
     evidência em docs/allure.png -->
<!-- <img alt="Allure report" width="100%" src="https://raw.githubusercontent.com/bscarpari/test-qa-cucumber-bdd/main/docs/allure.png"> -->

---

## 🌐 About

UI test automation for [BugBank](https://bugbank.netlify.app/) written in **BDD** style: scenarios are described in **Gherkin** and executed by **Cucumber** on top of Selenium.

The point of this approach is that the test file reads as a specification — a product owner or analyst can review what is being validated without reading Java. Step definitions keep the technical implementation separate from the business description.

<sub>Originally solved as a technical challenge.</sub>

---

## 🚀 Technologies

<!-- PLACEHOLDER: remover a badge do REST Assured se não houver testes de API aqui. -->
![Java](https://img.shields.io/badge/Java%2017-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Allure](https://img.shields.io/badge/Allure-FF4500?style=for-the-badge&logo=qameta&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

- **Cucumber** — runs Gherkin feature files and binds them to step definitions
- **Gherkin** — Given/When/Then syntax describing behaviour in plain language
- **Selenium** — browser automation behind the steps
- **Java 17** — language and runtime
- **Allure** — reporting with scenario steps and attachments
- **Maven** — build and test execution

---

## 🧪 Coverage

| Feature | Scenario |
|---------|----------|
| Registration | Creating a new account and confirming the success feedback |
| Login | Authenticating with valid credentials and reaching the dashboard |

<!-- PLACEHOLDER: cenários em aberto — completar e mover para a tabela acima,
     ou manter fora do README até estarem prontos.
     - Extrato (account statement)
     - Transferência (transfer between accounts)
     Ambos já existem no repo test-qa-ui: aqui é portar para Gherkin. -->

**Structure**

```plaintext
src/test/
├── resources/
│   └── features/        # Gherkin .feature files
└── java/
    ├── steps/           # step definitions
    └── pages/           # page objects
```

---

## 💻 Getting started

**Requirements**

| Tool | Version |
|------|---------|
| Java (JDK) | 17 |
| Maven | 3.8+ |
| Allure CLI | [installation guide](https://docs.qameta.io/allure/) |

**1. Clone the repository**

```bash
git clone https://github.com/bscarpari/test-qa-cucumber-bdd.git
cd test-qa-cucumber-bdd
```

**2. Open the project in IntelliJ IDEA**

**3. Set the project SDK to Java 17**

```text
File > Project Structure > Project > Project SDK > 17
```

**4. Run the tests**

Via terminal:

```bash
mvn test
```

Or through the IDE:

```text
Maven panel (right sidebar) > Lifecycle > test
```

---

## 📊 Reports

Run the full suite **before** generating the report — Allure builds it from the results of the last execution.

```bash
allure generate --clean
allure open
```

Requires the Allure CLI installed locally. Follow the [official instructions](https://docs.qameta.io/allure/) if you don't have it.

---

## 📄 License

[MIT](https://choosealicense.com/licenses/mit/)

---

<p align="center">
  Made with 💜 by <a href="https://www.linkedin.com/in/bscarpari/">Bruno Scarpari</a> ·
  <a href="https://github.com/bscarpari">GitHub</a> ·
  <a href="mailto:bscarpari.dev@gmail.com">Email</a>
</p>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<img alt="Footer" width="100%" src="https://capsule-render.vercel.app/api?type=waving&color=7B61FF&height=100&section=footer"/>
