const { Builder, By, Key } = require('selenium-webdriver')

async function test() {
  const browser = new Builder().forBrowser('firefox').build()
  await browser.get('http://localhost:3000')
  //   await browser.sleep(2000)

  // get element for email
  const emailInput = await browser.findElement(By.id('email'))
  emailInput.sendKeys('amit@test.com')
  //   await browser.sleep(2000)

  // get element for password
  const passwordInput = await browser.findElement(By.id('password'))
  passwordInput.sendKeys('test')
  //   await browser.sleep(2000)

  // get button login
  const buttonLogin = await browser.findElement(By.className('btn-success'))
  await buttonLogin.click()

  // get the element for result
  const resultDiv = await browser.findElement(By.id('result'))
  const result = await resultDiv.getText()
  console.log(result)

  //   await browser.sleep(5000)
  await browser.close()
}

test()
