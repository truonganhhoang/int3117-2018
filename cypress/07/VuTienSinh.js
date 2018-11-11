describe('Edx Login Test', function() {
    it('Test Login page of edx', function() {
        cy.visit('https://www.facebook.com')

        cy.get('#email')
          .type('01233994926')
        cy.get('#loginbutton')
          .click()
        cy.url().should('include', 'login_attempt')

        cy.get('#pass')
            .type('12345678')
        cy.get('#loginbutton')
            .click()
        cy.url().should('include', 'login_attempt')
       
    })
  })