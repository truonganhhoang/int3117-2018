describe('Test Exam', function(){
  it('go on test', function(){
    cy.visit('https://hoclieu.sachmem.vn/question_set/5a4b189348150cd8b906539b/5aaf6fd60080c50210e873ff/preview')
  })

  it('do test', function(){
    // Lua chon lam ca b
    cy.get('a.btn-outline-primary').click()
    // Tra loi cac cau hoi
    cy.get('.select05b593e33a653fc8e194c7de4 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de5 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de6 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de7 > .row > :nth-child(1) > .select-check').click()
    cy.get('.select05b593e33a653fc8e194c7de8 > .row > :nth-child(1) > .select-check').click()
    // Nop bai
    cy.get('.btn-warning').click()
  })
})ai
