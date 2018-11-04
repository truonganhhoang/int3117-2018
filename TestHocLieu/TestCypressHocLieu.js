describe('TestHocLieu', function() {
    it('Go to class test', function() {

        cy.visit('https://hoclieu.sachmem.vn/folder/0');
        cy.contains('Lớp học của tôi').click()
        cy.contains('Kiểm thử 2018').click()
        cy.get('.fa-th-list').click()
        cy.contains('A').click()
    })
})