const { Builder, By, Key } = require('selenium-webdriver')

async function test1() {
  // create an environment (build the configuration for a required browser)
  const browser = new Builder().forBrowser('firefox').build()

  // open the required url
  await browser.get('https://google.co.in')

  // sleep for 5 seconds
  await browser.sleep(5000)

  // quit the browser
  await browser.close()
}
// test1()

async function test2() {
  const browser = new Builder().forBrowser('firefox').build()

  await browser.get('https://google.co.in')
  await browser.sleep(5000)

  // search the element using name='q'
  const input = await browser.findElement(By.name('q'))

  // enter iphone into the input
  await input.sendKeys('iphone')
  await browser.sleep(2000)

  // press enter
  await input.sendKeys(Key.ENTER)
  await browser.sleep(2000)

  await browser.close()
}
test2()
