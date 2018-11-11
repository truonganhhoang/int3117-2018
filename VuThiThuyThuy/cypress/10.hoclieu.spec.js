context('Actions', () => {
  beforeEach(() => {
    cy.visit('https://hoclieu.sachmem.vn')
  })
   it('Home page', () => {
    cy.get('.navbar-brand').click()
    cy.url().should('eq', 'https://hoclieu.sachmem.vn/')
  })
})