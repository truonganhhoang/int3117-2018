describe('Edx Login Test', function() {
  it('Test Login page of edx', function() {
      cy.visit('https://accounts.sachmem.vn/users/sign_in')

      cy.get('input').contains('Đăng nhập')
        .click()
      cy.url().should('include', '/sign_in')
      cy.wait(3000)

      cy.get('#user_email')
        .type('buimanhthangisp@gmail.com')
      cy.get('input').contains('Đăng nhập')
        .click()
      cy.url().should('include', '/sign_in')
      cy.wait(3000)

      cy.get('#user_password')
        .type('tiubswoieuw')
      cy.get('input').contains('Đăng nhập')
        .click()
      cy.url().should('include', '/sign_in')
      cy.wait(3500)

      cy.get('#user_password')
        .clear()
        .type('thangbm12')
      cy.wait(1000)
      cy.get('input').contains('Đăng nhập')
        .click()
      cy.url().should('eq', 'https://www.sachmem.vn/')
      cy.wait(2000)
  })
})