// @author: Loc

describe('GitHub Login Test', function() {
    it('Login to Create an account.', function() {
      cy.visit('/login')
      
      cy.contains('Create an account').click()
  
      cy.url().should('include', 'join?source=login')
    })
  })