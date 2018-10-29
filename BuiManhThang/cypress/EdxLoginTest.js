describe('Edx Login Test', function() {
    it('Test Login page of edx', function() {
        cy.visit('https://www.edx.org/login')

        cy.get('.login-button')
          .click()
        cy.url().should('include', '/login')
        cy.wait(3000)

        cy.get('#login-email')
          .type('buimanhthangisp@gmail.com')
        cy.get('.login-button')
          .click()
        cy.url().should('include', '/login')
        cy.wait(3000)

        cy.get('#login-password')
          .type('tiubswoieuw')
        cy.get('.login-button')
          .click()
        cy.url().should('include', '/login')
        cy.wait(3500)

        cy.get('#login-password')
          .clear()
          .type('123456abc')
        cy.wait(1000)
        cy.get('.login-button')
          .click()
        cy.url().should('include', '/dashboard')
        cy.wait(2000)
    })
  })