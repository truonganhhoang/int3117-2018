context('Scratch  test all ', () => {
  beforeEach(() => {
    cy.visit('https://hoclieu.sachmem.vn/question_set/5b8f590a74d7e6fe1d6b854f/5b95cac1224bfbf1a5bf4ede/view/0')
  })

  it('Total question', async () => {
    cy.get('ul#question-nos li').should(($lis) => {
      expect($lis).to.have.length(20)
    }) 
  })

  it('Change question', async () => {
    await cy.get('ul#question-nos li').eq(2).click()
    await cy.url().should('eq', "https://hoclieu.sachmem.vn/question_set/5b8f590a74d7e6fe1d6b854f/5b95cac1224bfbf1a5bf4ede/view/2")
  })

  it('Next question', async () => {
    await cy.get('.pull-right').eq(2).click()
    await cy.url().should('eq', "https://hoclieu.sachmem.vn/question_set/5b8f590a74d7e6fe1d6b854f/5b95cac1224bfbf1a5bf4ede/view/1")
  })

  it('Select answer', async () => {
    await cy.get('.select-answer').eq(0).click()
    await cy.get('.select-answer').eq(0).should('have.class', 'select-checked')
  })

  it('Submit', async () => {
    await cy.get('.btn-warning').should('be.disabled')
    await cy.get('.select-answer').eq(0).click()
    await cy.get('.btn-warning').click()
    await cy.get('.btn-warning').should('be.disabled')
    await cy.get('.select-answer').eq(0).should('be.disaled')
  })
})