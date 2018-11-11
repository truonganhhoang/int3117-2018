// @author: DMinh

describe('GitHub Login Test', function() {
    it('Login to Forgot Password', function() {
      cy.visit('/login')
      
      cy.contains('Forgot password?').click()
  
      cy.url().should('include', 'password_reset')
    })
  })