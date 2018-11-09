context('Actions', () => {
  beforeEach(() => {
    cy.visit('https://violympic.vn')
  })

  it('back Home', () => {
    cy.get('._3JtEO _3bE6i').click()
    cy.url().should('eq', 'http://violympic.vn/user-home')
  })
})