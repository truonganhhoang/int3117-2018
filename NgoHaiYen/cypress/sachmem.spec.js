context('Actions', () => {
  beforeEach(() => {
    cy.visit('https://hoclieu.sachmem.vn')
  })

  it('ve trang chu', () => {
    cy.get('.logo').click()
    cy.url().should('eq', 'https://hoclieu.sachmem.vn/folder/0')
  })
})
