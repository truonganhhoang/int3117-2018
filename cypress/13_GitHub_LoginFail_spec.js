// @author: Neo

describe('GitHub Login Test', function() {
  it('Login Fail', function() {
    cy.visit('/login')

    cy.get('input[name=login]').type('randomMail')
    
    cy.get('input[name=password]').type('1234567')
    
    cy.get('input[name=commit]').click()

    cy.contains('Incorrect username or password.')
  })
})