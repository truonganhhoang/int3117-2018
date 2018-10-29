describe('Test Exam', function(){
  it('Access to website', function(){
    cy.visit('https://hoclieu.sachmem.vn/question_set/5a4b189348150cd8b906539b/5aaf6fd60080c50210e873ff/preview')
  })

  it('check login', async () => {
    await cy.get('#link-login').click()
    await cy.url().should('eq', "https://accounts.sachmem.vn/users/sign_in")
  })

  it('do test', function(){
    cy.get(':nth-child(1) > .btn-primary').click()
    cy.get(':nth-child(1) > .select-check').click()
    cy.get('.mt-4 > .btn').click()
    cy.get('[title="Câu tiếp"] > .fa').click()
  })
})

