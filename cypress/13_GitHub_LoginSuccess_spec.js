// @author: QMinh

describe('GitHub Login Test', function() {
    it('Login Success', function() {
      cy.visit('/login')
  
      cy.get('input[name=login]').type('realfee97@gmail.com')
      
      cy.get('input[name=password]').type('do1dai2hoc3')
      
      cy.get('input[name=commit]').click()
  
      cy.url().should('include', '')
    })
  })