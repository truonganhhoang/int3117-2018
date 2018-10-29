describe('Test Exam', function(){
  it('go to test', function(){
    cy.visit('https://hoclieu.sachmem.vn/question_set/5a4b189348150cd8b906539b/5aaf6fd60080c50210e873ff/preview')
  })

  it('do test', function(){
    // Cau hoi 1
    cy.get(':nth-child(1) > .btn-primary').click()
    cy.get(':nth-child(1) > .select-check').click()
    cy.get('.mt-4 > .btn').click()
    cy.get('[title="Câu tiếp"] > .fa').click()

    // Cau hoi 2
    cy.get(':nth-child(1) > .select-check').click()
    cy.get('.mt-4 > .btn').click()
    cy.get('[title="Câu tiếp"] > .fa').click()

    // Cau hoi 3
    cy.get(':nth-child(1) > .select-check').click()
    cy.get('.mt-4 > .btn').click()
    cy.get('[title="Câu tiếp"] > .fa').click()

    // Cau hoi 4
    cy.get(':nth-child(1) > .select-check').click()
    cy.get('.mt-4 > .btn').click()
    cy.get('[title="Câu tiếp"] > .fa').click()

    // Cau hoi 5
    cy.get(':nth-child(1) > .select-check').click()
    cy.get('.mt-4 > .btn').click()
  })
})
