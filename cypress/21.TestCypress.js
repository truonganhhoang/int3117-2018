describe('test content', function() {
    it('go to hoc lieu', function() {
        cy.visit('https://hoclieu.sachmem.vn/folder/0')
        cy.contains('Đăng nhập')
        cy.contains('Tham gia làm bài tập')
    })
})

describe('test guide', function() {
    it('click to guide', function() {
        cy.visit('https://gioithieu.sachmem.vn/')
        cy.contains('Hướng dẫn').click()
        cy.url().should('include', '/da-xuat-hien-sach-tieng-anh-gia-kem-the-cao-sach-mem-gia-tren-thi-truong/')
    })
})